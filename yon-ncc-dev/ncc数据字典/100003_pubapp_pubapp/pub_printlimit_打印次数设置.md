# |<<

**打印次数设置 (pub_printlimit / nc.vo.uapbd.printlimit.PrintLimitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4756.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printlimit | 打印次数主键 | pk_printlimit | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型编码 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | billtypename | 单据类型名称 | billtypename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | printlimit | 限制次数 | printlimit | int |  | 整数 (Integer) |
| 5 | controltype | 控制方式 | controltype | int |  | 控制方式 (contrltype) |  | 0=提示; |