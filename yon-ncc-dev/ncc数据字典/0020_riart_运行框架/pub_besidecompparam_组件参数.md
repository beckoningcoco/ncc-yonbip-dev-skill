# |<<

**组件参数 (pub_besidecompparam / nc.vo.pub.beside.BesideCompParamVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4710.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_compparam | 组件映射信息主键 | pk_compparam | varchar(50) | √ | 字符串 (String) |
| 2 | paramname | 参数名称 | paramname | varchar(20) | √ | 组件参数参照 (besidecompparamref) |
| 3 | datatype | 字段类型 | datatype | varchar(50) | √ | 字段类型 (attrdatatype) |  | 1=字符型; |