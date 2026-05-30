# |<<

**薪资个别调整表 (wa_datas / nc.vo.wa.paydata.DataSVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6332.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_datas | 主键 | pk_wa_datas | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_data | 薪资档案主键 | pk_wa_data | varchar(20) | √ | 主键 (UFID) |
| 3 | pk_wa_classitem | 薪资发放项目主键 | pk_wa_classitem | varchar(20) | √ | 主键 (UFID) |
| 4 | value | 金额 | value | decimal(31, 8) |  | 数值 (UFDouble) |
| 5 | notes | 调整原因 | notes | varchar(1024) |  | 备注 (Memo) |
| 6 | to_next | 是否带入下期 | to_next | char(1) |  | 布尔类型 (UFBoolean) | N |
| 7 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |