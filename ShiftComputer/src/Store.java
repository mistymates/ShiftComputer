import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<GPU> gpus;
    private List<CPU> cpus;
    private List<RAM> rams;
    private List<Motherboard> motherboards;
    private List<PowerSupply> powersupply;
    private List<Storage> storages;
    private List<Case> cases;

    public Store() {
        gpus = new ArrayList<>();
        cpus = new ArrayList<>();
        rams = new ArrayList<>();
        motherboards = new ArrayList<>();
        powersupply = new ArrayList<>();
        storages = new ArrayList<>();
        cases = new ArrayList<>();
        initializeStore();
    }

    private void initializeStore() {
        gpus.add(new GPU("NVIDIA RTX 3080", 9000000, 10));
        gpus.add(new GPU("AMD Radeon RX 6800 XT", 1100000, 12));
        gpus.add(new GPU("NVIDIA RTX 3090", 12000000, 24));

        cpus.add(new CPU("Intel Core i9-10900K", 6000000, 10));
        cpus.add(new CPU("AMD Ryzen 9 5900X", 5500000, 12));
        cpus.add(new CPU("Intel Core i7-10700K", 6500000, 8));

        rams.add(new RAM("Corsair Vengeance LPX 16GB", 1000000, 16));
        rams.add(new RAM("G.Skill Trident Z Neo 32GB", 2000000, 32));
        rams.add(new RAM("Corsair Vengeance RGB Pro 32GB", 1500000, 32));

        motherboards.add(new Motherboard("ASUS ROG Strix Z490-E Gaming", 5000000, 5));
        motherboards.add(new Motherboard("MSI MEG Z490 Godlike", 6000000, 5));
        motherboards.add(new Motherboard("ASUS ROG Maximus XII Extreme", 7000000, 4));

        powersupply.add(new PowerSupply("Corsair RM750", 400000, 750));
        powersupply.add(new PowerSupply("NZXT RM850", 800000, 850));
        powersupply.add(new PowerSupply("MSI RM1000", 900000, 1000));

        storages.add(new Storage("XPG Evo Plus 5TB", 2000000, 5));
        storages.add(new Storage("Samsung 970 Evo Plus 2TB", 4000000, 2));
        storages.add(new Storage("ADATA 320 SATA 4TB", 8000000, 4));

        cases.add(new Case("Corsair H510", 1000000));
        cases.add(new Case("Lian Li EVO", 1500000));
        cases.add(new Case("NZXT H510", 2000000));
    }

    public List<GPU> getGPUs() {
        return gpus;
    }

    public List<CPU> getCPUs() {
        return cpus;
    }

    public List<RAM> getRAMs() {
        return rams;
    }

    public List<Motherboard> getMotherboards() {
        return motherboards;
    
    }
    public List<PowerSupply> getPowerSupplies() {
        return powersupply;
    }

    public List<Storage> getStorages() {
        return storages;
    }

    public List<Case> getCases() {
        return cases;
    }
}
