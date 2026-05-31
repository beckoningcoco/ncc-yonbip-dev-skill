# |<<

**工具 (pam_tools / nc.vo.am.tools.ToolsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4337.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tool | 工具主键 | pk_tool | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | tool_code | 编码 | tool_code | varchar(40) |  | 字符串 (String) |
| 5 | tool_name | 名称 | tool_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 7 | std_rate | 标准费率 | std_rate | decimal(20, 8) |  | 数值 (UFDouble) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |