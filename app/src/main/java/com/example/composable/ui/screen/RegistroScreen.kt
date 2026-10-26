package com.example.composable.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Colores de la pantalla (indigo y gris)
private val IndigoPrimary = Color(0xFF4F46E5)
private val IndigoSurface = Color(0xFFF8F9FE)
private val GrayTextPrimary = Color(0xFF1E293B)
private val GrayTextSecondary = Color(0xFF64748B)
private val GrayBorder = Color(0xFFE2E8F0)
private val GrayBackgroundField = Color(0xFFF1F5F9)

@Composable
fun RegistroScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = IndigoSurface
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 24.dp)
                .padding(top = 16.dp, bottom = 32.dp)
        ) {
            // 1. Flecha para volver
            IconButton(
                onClick = { },
                modifier = Modifier.size(44.dp)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Atrás",
                    tint = GrayTextPrimary
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 2. Titulo
            Text(
                text = "Crea tu cuenta",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = GrayTextPrimary
                )
            )

            Spacer(modifier = Modifier.height(6.dp))

            // 3. Subtitulo
            Text(
                text = "Empieza tu viaje con nosotros",
                style = TextStyle(fontSize = 15.sp, color = GrayTextSecondary)
            )

            Spacer(modifier = Modifier.height(28.dp))

            // 4. Campo: Nombre completo
            OutlinedTextField(
                value = "Alejandro Morales",
                onValueChange = { },
                label = { Text("Nombre completo") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Person,
                        contentDescription = null,
                        tint = GrayTextSecondary
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp),
                colors = coloresCampo(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 5. Campo: Correo electronico
            OutlinedTextField(
                value = "alejandro.morales@ejemplo.com",
                onValueChange = { },
                label = { Text("Correo electrónico") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Email,
                        contentDescription = null,
                        tint = GrayTextSecondary
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp),
                colors = coloresCampo(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 6. Campo: Contraseña (candado y ojo)
            OutlinedTextField(
                value = "miSuperPassword123",
                onValueChange = { },
                label = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = null,
                        tint = GrayTextSecondary
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Visibility,
                        contentDescription = "Ver contraseña",
                        tint = GrayTextSecondary
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp),
                colors = coloresCampo(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 7. Campo: Confirmar contraseña (candado)
            OutlinedTextField(
                value = "miSuperPassword123",
                onValueChange = { },
                label = { Text("Confirmar contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = null,
                        tint = GrayTextSecondary
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(16.dp),
                colors = coloresCampo(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(14.dp))

            // 8. Checkbox de terminos y condiciones
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = true,
                    onCheckedChange = { },
                    colors = CheckboxDefaults.colors(checkedColor = IndigoPrimary)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "Acepto los términos y condiciones",
                    style = TextStyle(fontSize = 13.sp, color = GrayTextPrimary)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 9. Boton principal
            Button(
                onClick = { },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = IndigoPrimary),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp)
            ) {
                Text(
                    text = "Crear cuenta",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 10. Separador: O registrate con
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(1.dp)
                        .background(GrayBorder)
                )
                Text(
                    text = "O REGÍSTRATE CON",
                    modifier = Modifier.padding(horizontal = 12.dp),
                    style = TextStyle(
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = GrayTextSecondary
                    )
                )
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(1.dp)
                        .background(GrayBorder)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // 11. Boton: Continuar con Google
            OutlinedButton(
                onClick = { },
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(1.dp, GrayBorder),
                colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "G",
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Black,
                                color = Color(0xFF4285F4)
                            )
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Continuar con Google",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            color = GrayTextPrimary
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(28.dp))

            // 12. Pie: ¿Ya tienes una cuenta? Inicia sesion
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("¿Ya tienes una cuenta? ")
                        withStyle(SpanStyle(color = IndigoPrimary, fontWeight = FontWeight.Bold)) {
                            append("Inicia sesión")
                        }
                    },
                    style = TextStyle(fontSize = 14.sp, color = GrayTextSecondary)
                )
            }
        }
    }
}

// Colores de los campos de texto
@Composable
private fun coloresCampo() = OutlinedTextFieldDefaults.colors(
    focusedContainerColor = Color.White,
    unfocusedContainerColor = GrayBackgroundField,
    focusedBorderColor = IndigoPrimary,
    unfocusedBorderColor = Color.Transparent,
    focusedLabelColor = IndigoPrimary,
    unfocusedLabelColor = GrayTextSecondary,
    focusedTextColor = GrayTextPrimary,
    unfocusedTextColor = GrayTextPrimary
)

@Preview(showBackground = true)
@Composable
private fun PreviewRegistro() {
    MaterialTheme { // Si quieres, cambia esto por el tema de tu proyecto
        RegistroScreen()
    }
}