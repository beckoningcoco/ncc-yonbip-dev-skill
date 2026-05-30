# |<<

**IUFO数据版本 (iufo_dataversion / nc.vo.iufo.verctrl.DataVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3412.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataversion | 数据版本主键 | pk_dataversion | char(20) | √ | 主键 (UFID) |
| 2 | pk_versionno | 数据版本编号 | pk_versionno | int | √ | 整数 (Integer) |
| 3 | ver_name | 版本名称 | ver_name | varchar(64) | √ | 多语文本 (MultiLangText) |
| 4 | ver_type | 版本类型 | ver_type | int | √ | 数据版本类型 (enum) |  | 0=个别报表版本; |