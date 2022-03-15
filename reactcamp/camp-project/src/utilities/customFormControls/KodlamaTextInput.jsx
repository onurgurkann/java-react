import { useField } from 'formik'
import React from 'react'
import { FormField, Label } from 'semantic-ui-react'

export default function KodlamaTextInput({ ...props }) {
    //console.log(props)
    const [field, meta] = useField(props)
    //console.log(meta)
    return (
        // !!meta.error -> string bir değeri boolean olarak karşılaştırmak için javascript de string bir metin 
        // varsa true yoksa false döndürmesi için kullandık
        <FormField error={meta.touched && !!meta.error}> 
            <input {...field} {...props}/>
            {meta.touched && !!meta.error ? (
                <Label pointing basic color='red' content={meta.error}></Label>
            ):null}
        </FormField>
    )
}
