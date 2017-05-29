package up.scale.domain

/**
  * Created by Nathan on 29/05/2017.
  */
package object in {
  type Percentage = Int
  type PortfolioId = String
  type SatellitePortfolioList = Map[PortfolioId, Percentage]
}
