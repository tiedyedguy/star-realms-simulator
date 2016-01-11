package starrealmssimulator.bots;

import starrealmssimulator.cards.bases.blob.*;
import starrealmssimulator.cards.bases.outposts.machinecult.*;
import starrealmssimulator.cards.bases.outposts.starempire.*;
import starrealmssimulator.cards.bases.outposts.tradefederation.*;
import starrealmssimulator.cards.bases.starempire.FleetHQ;
import starrealmssimulator.cards.bases.starempire.OrbitalPlatform;
import starrealmssimulator.cards.bases.starempire.StarbaseOmega;
import starrealmssimulator.cards.bases.tradefederation.*;
import starrealmssimulator.cards.heroes.*;
import starrealmssimulator.cards.ships.*;
import starrealmssimulator.cards.ships.blob.*;
import starrealmssimulator.cards.ships.machinecult.*;
import starrealmssimulator.cards.ships.starempire.*;
import starrealmssimulator.cards.ships.tradefederation.*;
import starrealmssimulator.model.Bot;
import starrealmssimulator.model.Card;

public class AttackBot extends Bot {

    @Override
    public int getBuyCardScore(Card card) {
        int deck = getCurrentDeckNumber();
        int bases = getNumBases();

        //Heroes
        if (card instanceof RamPilot) {
            if (deck == 1) {
                return 15;
            } else if (deck <= 3) {
                return 30;
            }
            return 15;
        } else if (card instanceof BlobOverlord) {
            if (deck == 1) {
                return 20;
            } else if (deck <= 3) {
                return 40;
            }
            return 20;
        } else if (card instanceof SpecialOpsDirector) {
            if (deck == 1) {
                return 1;
            } else if (deck <= 3) {
                return 10;
            }
            return 5;
        } else if (card instanceof CeoTorres) {
            if (deck == 1) {
                return 5;
            } else if (deck <= 3) {
                return 15;
            }
            return 10;
        } else if (card instanceof WarElder) {
            if (deck == 1) {
                return 10;
            } else if (deck <= 3) {
                return 25;
            }
            return 5;
        } else if (card instanceof HighPriestLyle) {
            if (deck == 1) {
                return 15;
            } else if (deck <= 3) {
                return 30;
            }
            return 10;
        } else if (card instanceof CunningCaptain) {
            if (deck == 1) {
                return 15;
            } else if (deck <= 3) {
                return 30;
            }
            return 15;
        } else if (card instanceof AdmiralRasmussen) {
            if (deck == 1) {
                return 20;
            } else if (deck <= 3) {
                return 40;
            }
            return 20;
        }

        //Blob
        if (card instanceof BattleBlob) {
            return 85;
        } else if (card instanceof BattlePod) {
            if (deck < 3) {
                return 40;
            }
            return 30;
        } else if (card instanceof BattleScreecher) {
            if (deck < 3) {
                return 50;
            }
            return 40;
        } else if (card instanceof Bioformer) {
            if (deck == 1) {
                return 60;
            } else if (deck == 2) {
                return 35;
            } else if (deck == 3) {
                return 10;
            }
        } else if (card instanceof BlobCarrier) {
            if (deck < 3) {
                return 90;
            }
            return 70;
        } else if (card instanceof BlobDestroyer) {
            int opponentBases = getOpponent().getNumBases();
            if (opponentBases > 3) {
                return 80;
            } else if (opponentBases > 2) {
                return 70;
            }
            return 60;
        } else if (card instanceof BlobFighter) {
            if (deck == 1) {
                return 30;
            } else if (deck == 2) {
                return 50;
            } else {
                return 60;
            }
        } else if (card instanceof BlobWheel) {
            if (deck == 1) {
                return 50;
            } else if (deck == 2) {
                return 25;
            } else if (deck == 3) {
                return 5;
            }
        } else if (card instanceof BlobWorld) {
            return 80;
        } else if (card instanceof BreedingSite) {
            if (deck < 3 && bases > 0) {
                return 55;
            } else if (deck < 3 || bases >= 2) {
                return 50;
            } else if (bases == 0) {
                return 30;
            }
            return 40;
        } else if (card instanceof CargoPod) {
            if (deck == 1) {
                return 85;
            } else if (deck == 2) {
                return 45;
            } else if (deck == 3) {
                return 15;
            } else {
                return 10;
            }
        } else if (card instanceof DeathWorld) {
            if (deck < 3) {
                return 90;
            }
            if (deck == 3) {
                return 80;
            }
            return 70;
        } else if (card instanceof Leviathan) {
            return 120;
        } else if (card instanceof Moonwurm) {
            return 100;
        } else if (card instanceof Mothership) {
            return 100;
        } else if (card instanceof Obliterator) {
            int opponentBases = getOpponent().getNumBases();
            if (opponentBases > 3) {
                return 95;
            } else if (opponentBases > 2) {
                return 85;
            }
            return 75;
        } else if (card instanceof Parasite) {
            if (deck < 3) {
                return 80;
            }
            return 60;
        } else if (card instanceof PlasmaVent) {
            if (blobCardPlayedThisTurn()) {
                if (deck <= 2) {
                    return 40;
                } else if (deck == 3) {
                    return 60;
                }
                return 50;
            } else {
                if (deck <= 2) {
                    return 20;
                }
                return 50;
            }
        } else if (card instanceof Predator) {
            if (deck == 1) {
                return 35;
            } else if (deck == 2) {
                return 55;
            } else {
                return 65;
            }
        } else if (card instanceof Ram) {
            if (deck < 3) {
                return 70;
            }
            return 55;
        } else if (card instanceof Ravager) {
            return 45;
        } else if (card instanceof SpikePod) {
            if (deck < 3) {
                return 35;
            }
            return 25;
        } else if (card instanceof StellarReef) {
            if (deck == 1) {
                return 35;
            } else if (deck == 2) {
                return 25;
            } else if (deck == 3) {
                return 5;
            }
        } else if (card instanceof Swarmer) {
            if (deck < 3) {
                return 35;
            }
            return 25;
        } else if (card instanceof TheHive) {
            if (deck <= 2) {
                return 20;
            }
            return 50;
        } else if (card instanceof TradePod) {
            if (deck == 1) {
                return 80;
            } else if (deck == 2) {
                return 40;
            } else if (deck == 3) {
                return 10;
            } else {
                return 5;
            }
        } else if (card instanceof TradeWheel) {
            if (deck == 1) {
                return 40;
            } else if (deck == 2) {
                return 30;
            } else if (deck == 3) {
                return 10;
            }
        }

        //Trade Federation
        else if (card instanceof BarterWorld) {
            if (deck == 1) {
                return 25;
            }
            return 10;
        } else if (card instanceof CapitolWorld) {
            if (deck <= 3) {
                return 60;
            }
            return 40;
        } else if (card instanceof CentralOffice) {
            return 15;
        } else if (card instanceof CentralStation) {
            if (deck == 1) {
                return 5;
            }
        } else if (card instanceof ColonySeedShip) {
            if (tradeFederationCardPlayedThisTurn()) {
                if (deck == 1) {
                    return 80;
                } else if (deck == 2) {
                    return 50;
                } else if (deck == 3) {
                    return 40;
                }
                return 30;
            } else {
                if (deck == 1) {
                    return 70;
                } else if (deck == 2) {
                    return 30;
                } else if (deck == 3) {
                    return 20;
                }
                return 10;
            }
        } else if (card instanceof CommandShip) {
            return 75;
        } else if (card instanceof ConstructionHauler) {
            if (deck < 3) {
                return 30;
            } else if (deck == 3) {
                return 10;
            }
            return 5;
        } else if (card instanceof CustomsFrigate) {
            if (deck < 3) {
                return 10;
            }
            return 5;
        } else if (card instanceof Cutter) {
            if (deck == 1) {
                return 60;
            } else if (deck == 2) {
                return 20;
            }
        } else if (card instanceof DefenseCenter) {
            return 5;
        } else if (card instanceof EmbassyYacht) {
            return 0;
        } else if (card instanceof FactoryWorld) {
            if (deck <= 2) {
                return 20;
            }
            return 10;
        } else if (card instanceof FederationShipyard) {
            if (deck <= 2) {
                return 10;
            } else if (deck == 3) {
                return 5;
            }
        } else if (card instanceof FederationShuttle) {
            return 0;
        } else if (card instanceof Flagship) {
            return 50;
        } else if (card instanceof Freighter) {
            return 0;
        } else if (card instanceof FrontierFerry) {
            if (deck == 1) {
                return 70;
            } else if (deck == 2) {
                return 30;
            } else {
                return 25;
            }
        } else if (card instanceof LoyalColony) {
            if (deck <= 2) {
                return 10;
            }
            return 5;
        } else if (card instanceof Megahauler) {
            if (deck < 3) {
                return 50;
            } else if (deck == 3) {
                return 30;
            }
            return 10;
        } else if (card instanceof PortOfCall) {
            return 10;
        } else if (card instanceof PatrolCutter) {
            if (deck == 1) {
                return 60;
            } else if (deck == 2) {
                return 20;
            }
        } else if (card instanceof Peacekeeper) {
            return 50;
        } else if (card instanceof SolarSkiff) {
            return 0;
        } else if (card instanceof Starmarket) {
            if (deck == 1) {
                return 10;
            }
        } else if (card instanceof StorageSilo) {
            return 0;
        } else if (card instanceof TradeEscort) {
            return 10;
        } else if (card instanceof TradeHauler) {
            if (deck == 1) {
                return 5;
            }
        } else if (card instanceof TradeRaft) {
            return 0;
        } else if (card instanceof TradingPost) {
            if (deck == 1) {
                return 15;
            }
        }

        //Star Empire
        else if (card instanceof AgingBattleship) {

        } else if (card instanceof BattleBarge) {
            if (bases >= 4) {
                return 60;
            } else if (bases >= 2) {
                return 50;
            }
            return 40;
        } else if (card instanceof Battlecruiser) {
            return 75;
        } else if (card instanceof CargoLaunch) {
            return 10;
        } else if (card instanceof CommandCenter) {

        } else if (card instanceof Corvette) {
            if (deck < 3) {
                return 10;
            }
            return 20;
        } else if (card instanceof Dreadnaught) {
            return 95;
        } else if (card instanceof EmperorsDreadnaught) {

        } else if (card instanceof Falcon) {

        } else if (card instanceof FighterBase) {
            if (deck == 1) {
                return 10;
            }
            return 20;
        } else if (card instanceof FleetHQ) {
            if (deck < 3) {
                return 20;
            }
            return 10;
        } else if (card instanceof Gunship) {

        } else if (card instanceof HeavyCruiser) {

        } else if (card instanceof ImperialFighter) {
            if (deck == 1) {
                return 10;
            }
            return 15;
        } else if (card instanceof ImperialFrigate) {
            if (deck < 3) {
                return 30;
            }
            return 40;
        } else if (card instanceof ImperialPalace) {

        } else if (card instanceof ImperialTrader) {
            if (deck == 1) {
                return 80;
            } else if (deck == 2) {
                return 60;
            } else if (deck == 3) {
                return 50;
            }
            return 40;
        } else if (card instanceof Lancer) {

        } else if (card instanceof OrbitalPlatform) {

        } else if (card instanceof RecyclingStation) {
            return 30;
        } else if (card instanceof RoyalRedoubt) {
            return 30;
        } else if (card instanceof SpaceStation) {
            if (deck == 1) {
                return 30;
            }
            return 10;
        } else if (card instanceof StarBarge) {

        } else if (card instanceof StarFortress) {
            if (deck <= 3) {
                return 85;
            }
            return 75;
        } else if (card instanceof StarbaseOmega) {
            if (deck < 3 && bases > 0) {
                return 5;
            } else if (deck < 3) {
                return 0;
            } else if (bases >= 2) {
                return 5;
            } else if (bases == 0) {
                return 0;
            }
            return 5;
        } else if (card instanceof SurveyShip) {
            return 5;
        } else if (card instanceof SupplyDepot) {

        } else if (card instanceof WarWorld) {
            return 30;
        }

        //Machine Cult
        else if (card instanceof BattleBot) {

        } else if (card instanceof BattleMech) {
            return 30;
        } else if (card instanceof BattleStation) {
            if (deck < 3) {
                return 10;
            }
            return 20;
        } else if (card instanceof BorderFort) {
            if (deck == 1) {
                return 35;
            } else if (deck == 2) {
                return 15;
            }
        } else if (card instanceof BrainWorld) {
            if (deck < 3) {
                return 80;
            }
            if (deck == 3) {
                return 30;
            }
            return 15;
        } else if (card instanceof ConvoyBot) {

        } else if (card instanceof DefenseBot) {
            if (deck < 3 && bases > 0) {
                return 10;
            } else if (deck < 3) {
                return 5;
            }
        } else if (card instanceof FortressOblivion) {
            if (deck < 3 && bases > 0) {
                return 10;
            } else if (deck < 3) {
                return 5;
            }
        } else if (card instanceof FrontierStation) {

        } else if (card instanceof Junkyard) {
            return 0;
        } else if (card instanceof MachineBase) {
            if (deck < 3) {
                return 30;
            }
            if (deck == 3) {
                return 10;
            }
        } else if (card instanceof MechCruiser) {

        } else if (card instanceof MechWorld) {
            return 5;
        } else if (card instanceof MegaMech) {
            if (bases >= 4) {
                return 60;
            } else if (bases >= 2) {
                return 50;
            }
            return 35;
        } else if (card instanceof MiningMech) {

        } else if (card instanceof MissileBot) {
            if (deck == 1) {
                return 30;
            } else if (deck == 2) {
                return 10;
            }
        } else if (card instanceof MissileMech) {
            if (getOpponent().getNumBases() > 3) {
                return 70;
            }
            return 50;
        } else if (card instanceof PatrolBot) {
            if (deck == 1) {
                return 30;
            } else if (deck == 2) {
                return 10;
            }
        } else if (card instanceof PatrolMech) {
            if (deck == 1) {
                return 40;
            } else if (deck == 2) {
                return 20;
            }
        } else if (card instanceof RepairBot) {

        } else if (card instanceof SupplyBot) {
            if (deck == 1) {
                return 20;
            } else if (deck == 2) {
                return 10;
            }
        } else if (card instanceof StealthNeedle) {
            if (deck < 3) {
                return 30;
            }
            return 50;
        } else if (card instanceof StealthTower) {

        } else if (card instanceof TheArk) {
            if (deck < 3) {
                return 80;
            }
            return 75;
        } else if (card instanceof TheIncinerator) {

        } else if (card instanceof TheOracle) {

        } else if (card instanceof TheWrecker) {

        } else if (card instanceof TradeBot) {
            if (deck == 1) {
                return 10;
            }
        } else if (card instanceof WarningBeacon) {

        }

        //Other
        else if (card instanceof Explorer) {
            if (deck <= 2) {
                return 5;
            }
        } else if (card instanceof MercCruiser) {
            if (deck == 1) {
                return 20;
            }
            return 40;
        }

        return 0;
    }
}
