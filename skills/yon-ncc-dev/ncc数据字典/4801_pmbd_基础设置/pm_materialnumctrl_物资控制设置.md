# |<<

**物资控制设置 (pm_materialnumctrl / nc.vo.pbm.materialnumctrl.MaterialnumctrlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4481.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matnumctrl | 物资控制设置主键 | pk_matnumctrl | char(20) | √ | 主键 (UFID) |
| 2 | control_name | 控制规则名称 | control_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | control_type | 控制类型 | control_type | int |  | 控制类型 (controltype) |  | 1=刚性控制; |