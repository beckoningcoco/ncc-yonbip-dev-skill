# |<<

**海关商品税率 (bd_goodstaxes / nc.vo.bd.goodscode.GoodstaxesItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/855.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_goodstaxes | 海关商品税率主键 | pk_goodstaxes | char(20) | √ | 主键 (UFID) |
| 2 | favoredtaxes | 最惠国税率(关税) | favoredtaxes | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 100] |
| 3 | commontaxes | 普通税率(关税) | commontaxes | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 100] |
| 4 | consumetaxes | 消费税率 | consumetaxes | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 100] |
| 5 | risetaxes | 增值税率 | risetaxes | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 100] |
| 6 | supervise | 监管条件 | supervise | varchar(100) |  | 字符串 (String) |
| 7 | exporttaxes | 出口关税率 | exporttaxes | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 100] |
| 8 | exportaxesback | 出口退税率 | exportaxesback | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , 100] |
| 9 | startdate | 起始日期 | startdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 10 | enddate | 终止日期 | enddate | char(19) |  | 日期(结束) (UFDateEnd) |