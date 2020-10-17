package com.example.safepasswordmanager

import com.example.safepasswordmanager.models.Password

class Data {
    companion object{
        fun createDataSet():List<Password>{
            var passwordList= arrayListOf<Password>()
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "LuckyUser124",
                    1,
                    "000webhost"
                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "22311ffg@gmail.com",
                    "DummyHorse23",
                    2,
                    "Facebook"
                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "awfullelephant",
                    3,
                    "PayPal"
                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "hudini265",
                    4,
                    "Instagram"

                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "felas",
                    5,
                    "Gmail"
                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "Helosae",
                    1,
                    "UpWork"
                )
            )

            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "LuckyUser124",
                    1,
                    "000webhost"
                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "22311ffg@gmail.com",
                    "DummyHorse23",
                    2,
                    "Facebook"
                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "awfullelephant",
                    3,
                    "PayPal"
                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "hudini265",
                    4,
                    "Instagram"

                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "felas",
                    5,
                    "Gmail"
                )
            )
            passwordList.add(
                Password(
                    "dfghaslkgh^fkhdsflig",
                    "fhsjkdfha@gmail.com",
                    "Helosae",
                    1,
                    "UpWork"
                )
            )

            return passwordList
        }

    }
}