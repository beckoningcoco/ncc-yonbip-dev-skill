# |<<

**物资需求数据接收明细数据 (hstf_reqdatareceive_b / nc.vo.hstf.reqdatareceive.ReqDataReceiveBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2786.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reqdatareceiveb | BID | pk_reqdatareceiveb | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | srcmaterialcode | 对接系统物料编码 | srcmaterialcode | varchar(50) |  | 字符串 (String) |
| 4 | srcmaterialname | 对接系统物料名称 | srcmaterialname | varchar(50) |  | 字符串 (String) |
| 5 | srcformat | 对接系统规格 | srcformat | varchar(50) |  | 字符串 (String) |
| 6 | srcmodel | 对接系统型号 | srcmodel | varchar(50) |  | 字符串 (String) |
| 7 | srcunit | 对接系统计量单位 | srcunit | varchar(50) |  | 字符串 (String) |
| 8 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 11 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 13 | rownote | 行备注 | rownote | varchar(50) |  | 字符串 (String) |
| 14 | reqdate | 需求日期 | reqdate | char(19) |  | 日期 (UFDate) |
| 15 | srcbid | 对接系统行id | srcbid | varchar(50) |  | 字符串 (String) |
| 16 | destbid | 下游单据行id | destbid | varchar(50) |  | 字符串 (String) |