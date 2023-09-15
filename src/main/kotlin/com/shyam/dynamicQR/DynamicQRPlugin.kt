package com.shyam.dynamicQR

import com.generator.dynamicqr.qr.code.generator.QRCodeGen
import com.sun.tools.javac.util.Context
import org.gradle.api.Plugin
import org.gradle.api.Project

class DynamicQRPlugin: Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.create("SampleTask") {
            println("Hello Shyam")
            generateQRCode("code")
        }
    }
}
 fun generateQRCode( text: String){
    val qr = QRCodeGen()
    val bitmap = qr.encodeAsBitmap(text,400, 400, Context())
//    Toast.makeText(this, getString(R.string.qr_code_generated_successful_message), Toast.LENGTH_LONG).show()
//    iv_qr_code.setImageBitmap(bitmap)
  }