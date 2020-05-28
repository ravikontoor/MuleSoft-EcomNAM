%dw 2.0
output application/json
---


{
  "Order": {
    "region": "",
    "expression": "",
    "orderId": "",
    "carrier_name": "",
    "state": "",
    "external_order_status": "",
    "track": {
      "tracknumber": "",
      "lines": {
        "itemID": "",
        "lineQty": 0
      },
      "shipmentStatus": "",
      "linesItems": {
        "line": {
          "TrackingNumber": "",
          "ItemID": "",
          "Qty": 0
        }
      }
    }
  }
}
