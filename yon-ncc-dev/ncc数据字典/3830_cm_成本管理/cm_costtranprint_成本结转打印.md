# |<<

**成本结转打印 (cm_costtranprint / nc.vo.cm.pc.pc0410.CostTranPrintVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1458.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costtranprint | 成本结转打印 | pk_costtranprint | char(20) | √ | 主键 (UFID) |
| 2 | nlevel | 层次 | nlevel | int |  | 整数 (Integer) |
| 3 | nseq | 顺序 | nseq | int |  | 整数 (Integer) |
| 4 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cmarcostclassid | 成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 6 | ctranstatus | 结转状态 | ctranstatus | varchar(50) |  | 字符串 (String) |
| 7 | cvoucherstatus | 凭证状态 | cvoucherstatus | varchar(50) |  | 字符串 (String) |
| 8 | finishednum | 完工量 | finishednum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | onproducenum | 在产量 | onproducenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | wastenum | 废品量 | wastenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | begincost | 期初在产 | begincost | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | currentperiodcost | 本期投入 | currentperiodcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | finishedcost | 完工成本 | finishedcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | wastecost | 废品成本 | wastecost | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | tranoutcost | 转出成本 | tranoutcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | onproducecost | 在产成本 | onproducecost | decimal(28, 8) |  | 数值 (UFDouble) |