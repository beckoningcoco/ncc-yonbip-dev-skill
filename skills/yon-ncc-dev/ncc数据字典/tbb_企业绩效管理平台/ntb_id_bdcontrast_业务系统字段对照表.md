# |<<

**业务系统字段对照表 (ntb_id_bdcontrast / nc.vo.tb.obj.BdContrastVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3910.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | busisys_id | 业务系统id | busisys_id | varchar(50) |  | 字符串 (String) |
| 3 | busisys_name | 业务系统名称 | busisys_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | bill_type | 单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 5 | busi_type | 业务类型 | busi_type | varchar(50) |  | 字符串 (String) |
| 6 | pk_bdinfo | 基础档案主键 | pk_bdinfo | varchar(50) |  | 字符串 (String) |
| 7 | bdinfo_type | 基础档案类型 | bdinfo_type | varchar(50) |  | 字符串 (String) |
| 8 | att_fld | 业务字段名称 | att_fld | varchar(50) |  | 字符串 (String) |
| 9 | att_fld_desc | 业务字段描述 | att_fld_desc | varchar(200) |  | 多语文本 (MultiLangText) |
| 10 | levelctlflag | 是否可控制下级 | levelctlflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | reply_obj | 依赖档案 | reply_obj | varchar(50) |  | 字符串 (String) |
| 12 | issystem | 是否系统预置 | issystem | char(1) |  | 布尔类型 (UFBoolean) |