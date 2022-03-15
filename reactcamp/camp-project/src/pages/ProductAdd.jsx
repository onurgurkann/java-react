import { ErrorMessage, Field, Form, Formik } from 'formik'
import React from 'react'
import * as Yup from 'yup'
import { Button, FormField, Label } from 'semantic-ui-react'
import KodlamaTextInput from '../utilities/customFormControls/KodlamaTextInput'

export default function ProductAdd() {
    const initialValues = { productName: "", unitPrice: 10 } // başlangıç değerleri, ilk değerler

    const schema = Yup.object({ // alanların şeması
        productName: Yup.string().required("Ürün adı zorunlu"),
        unitPrice: Yup.number().required("Ürün fiyatı zorunlu")
    })
    return (
        <Formik
            initialValues={initialValues} // başlangıç değerleri
            validationSchema={schema} // doğrulama şeması (validation schema)
            onSubmit={(values)=>{   // submit olduğu zaman verilen fonksiyonun çalışır, values -> formda girilen değerlere karşılık gelir
                console.log(values)
            }}
        >
            <Form className='ui form'>
                <KodlamaTextInput name='productName' placeholder='Ürün Adı'/>
                <KodlamaTextInput name='unitPrice' placeholder='Ürün Fiyatı'/>
                <Button color='green' type='submit'>Ekle</Button>
            </Form>
        </Formik>
    )
}
