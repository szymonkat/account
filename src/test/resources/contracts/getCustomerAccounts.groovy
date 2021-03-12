import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url value('/v1/accounts?customerId=1')
    }
    response {
        status 200
        headers {
            header('Content-Type' : value(applicationJson()))
        }
        body(
                """
         {
            "accounts": [
               {
                  "id": 95213,
                  "nrb": "08897810189710581776778244",
                  "currency": "PLN"
               }
            ]
         }
         """
        )
    }
}
