# |<<

**数据接口子表 (hr_dataintface_b / nc.vo.hr.datainterface.FormatItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2665.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataintface_b | 接口设置子表主键 | pk_dataintface_b | char(20) | √ | 主键 (UFID) |
| 2 | ifid | 数据接口ID | ifid | char(20) |  | 主键 (UFID) |
| 3 | iseq | 序号 | iseq | int |  | 整数 (Integer) |
| 4 | isourcetype | 数据来源 | isourcetype | varchar(50) | √ | 数据来源 (DataFromEnum) | 1 | 0=单一型; |