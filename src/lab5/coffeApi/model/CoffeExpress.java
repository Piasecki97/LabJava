package lab5.coffeApi.model;
/**
 * Ekspres do kawy
 * @author Damian Piasecki
 *
 */
public class CoffeExpress {
	private CoffeContainer coffeContainer;
	private CupHolder cupHolder;
	private FrontPanel frontPanel;
	private MilkHeater milkHeater;
	private MilkPump milkPump;
	private SugarContainer sugarContainer;
	private WaterContainer waterContainer;
	private WaterHeater waterHeater;
	private WaterPump waterPump;
	
	public CoffeExpress(CoffeContainer coffeContainer, CupHolder cupHolder, FrontPanel frontPanel,
			MilkHeater milkHeater, MilkPump milkPump, SugarContainer sugarContainer, WaterContainer waterContainer,
			WaterHeater waterHeater, WaterPump waterPump) {
		super();
		this.coffeContainer = coffeContainer;
		this.cupHolder = cupHolder;
		this.frontPanel = frontPanel;
		this.milkHeater = milkHeater;
		this.milkPump = milkPump;
		this.sugarContainer = sugarContainer;
		this.waterContainer = waterContainer;
		this.waterHeater = waterHeater;
		this.waterPump = waterPump;
	}

	public void turnOnCoffeExpress() {
		frontPanel.turnOn();
		waterContainer.containing();
		coffeContainer.containing();
		waterHeater.heat();
		waterPump.pump();
	}

	public CoffeContainer getCoffeContainer() {
		return coffeContainer;
	}
	public void setCoffeContainer(CoffeContainer coffeContainer) {
		this.coffeContainer = coffeContainer;
	}
	public CupHolder getCupHolder() {
		return cupHolder;
	}
	public void setCupHolder(CupHolder cupHolder) {
		this.cupHolder = cupHolder;
	}
	public FrontPanel getFrontPanel() {
		return frontPanel;
	}
	public void setFrontPanel(FrontPanel frontPanel) {
		this.frontPanel = frontPanel;
	}
	public MilkHeater getMilkHeater() {
		return milkHeater;
	}
	public void setMilkHeater(MilkHeater milkHeater) {
		this.milkHeater = milkHeater;
	}
	public MilkPump getMilkPump() {
		return milkPump;
	}
	public void setMilkPump(MilkPump milkPump) {
		this.milkPump = milkPump;
	}
	public SugarContainer getSugarContainer() {
		return sugarContainer;
	}
	public void setSugarContainer(SugarContainer sugarContainer) {
		this.sugarContainer = sugarContainer;
	}
	public WaterContainer getWaterContainer() {
		return waterContainer;
	}
	public void setWaterContainer(WaterContainer waterContainer) {
		this.waterContainer = waterContainer;
	}
	public WaterHeater getWaterHeater() {
		return waterHeater;
	}
	public void setWaterHeater(WaterHeater waterHeater) {
		this.waterHeater = waterHeater;
	}
	public WaterPump getWaterPump() {
		return waterPump;
	}
	public void setWaterPump(WaterPump waterPump) {
		this.waterPump = waterPump;
	}

}
