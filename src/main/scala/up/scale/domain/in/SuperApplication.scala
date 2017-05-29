package up.scale.domain.in

case class SuperApplication(userId: String, tfn: String, atoTfnAuth: Boolean, corePortfolio: PortfolioId, satellitePortfolios: SatellitePortfolioList)

case class SuperAccount(superMemeberId: String, application: SuperApplication)