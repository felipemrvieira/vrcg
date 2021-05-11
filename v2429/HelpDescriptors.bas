B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private DB_Requests_Actions As String =  _
		$"AS - Acção Subsquente 
		    id              - Identificador numérico,
		    request_tagcode - Intervenção,
		    action_tagcode  - Acção/SubItem,
		    task_tagcode    - Tarefa,
		    item_tagcode    - Item da Tarefa,
		    uniquekey       - Chave unica,
		    tagcode         - Código Tag de Valor/AS,
			title			- Descritivo relacionado com a acção
		    status          - Estado,
		    priority        - Prioridade,
		    urgency         - Urgencia,
		    actiondatetime  - Data e hora da AS,
		    user_tagcode    - Utilizador,
		    take_action     - Acção tipificada,
		    details         - Detalhes da AS,
		    assigned_type   - Tipo de assignação (Equipa/Utilizador),
		    assigned_to     - Código tag da associação,
		    email_sent      - Enviou email?,
		    email_to        - Para quem enviou email,
		    email_datetime  - Data hora do envio de email,
		    related_task    - Tarefa relacionada"$
End Sub