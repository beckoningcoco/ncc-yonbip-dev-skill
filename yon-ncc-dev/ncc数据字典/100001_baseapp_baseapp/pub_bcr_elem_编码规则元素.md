# |<<

**编码规则元素 (pub_bcr_elem / nc.pub.billcode.vo.BillCodeElemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4704.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billcodeelem | 编码元素主键 | pk_billcodeelem | char(20) | √ | 主键 (UFID) |
| 2 | elemlenth | 元素长度 | elemlenth | int |  | 整数 (Integer) |
| 3 | elemtype | 元素类型 | elemtype | varchar(50) |  | 元素类型 (elemtypeenum) |  | 0=常量; |