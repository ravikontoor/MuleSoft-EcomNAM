%dw 2.0
output application/json
---
  {
    "Order": {
      "clientID": "abmI1YUPl2kXvnEzZ16CPNgpGu",
      "company_code": "",
      "country_Code": "US",
      "brandID": "LE",
      "creationDateTime": "2019-10-18T16:23:44.000Z",
      "changeDateTime": "2019-10-18T16:23:44.000Z",
      "alternateOrderID": "00000101",
      "customerOrderID": "00000101",
      "giftOrderInd": "N",
      "Orderamount": 3161.50,
      "currencyCode": "USD",
      "OrderItemamount": 2969.96,
      "discountAmount": "148.50",
      "OrdersalesTaxAmount": 150.55,
     
      "adjustments": {
        "adustmentAmount": 148.50
      },
      "shipping_adress": {
        "Shipmentamount": [
          40.99
        ],
        "adr1": [
          "4775 Ogeechee Dr"
        ],
        "city": [
          "Johns Creek"
        ],
        "country": [
          "US"
        ],
        "zip": [
          "30022"
        ],
        "ShipmemntsalesTaxAmount": [
          2.05
        ]
      },
      "paymentInfo": {
        "payMethodName": [
          "Visa"
        ],
        "billingContact": {
          "givenName": "Brian",
          "familyName": "Tarbell",
          "address": {
            "addressLine1": "4775 Ogeechee Dr",
            "cityName": "Johns Creek",
            "stateProvinceCode": "GA",
            "postalCode": "30022"
          }
        },
        "payMethodCode": "MC",
        "payMethodType": "PP"
      },
      "orderLine": [
        {
          "lineID": "3c9801bef24dffc978f296eaa5",
          "partNumber": "640188017003M",
          "retailAmount": 899.97,
          "sellingAmount": 719.97,
          "discountAmount": -180.00,
          "shippingamount": 25.00,
          "salesTaxAmount": 45.00
        },
        {
          "lineID": "b4f2eebadd8273b6a0457ed75b",
          "partNumber": "mitsubishi-wd-73736M",
          "retailAmount": 2249.99,
          "sellingAmount": 2249.99,
          "discountAmount": null,
          "shippingamount": 15.99,
          "salesTaxAmount": 112.50
        }
      ]
    }
  }