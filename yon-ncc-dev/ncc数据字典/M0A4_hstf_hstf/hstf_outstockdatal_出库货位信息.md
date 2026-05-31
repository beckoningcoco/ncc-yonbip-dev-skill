# |<<

**出库货位信息 (hstf_outstockdatal / nc.vo.hstf.outstockdata.OutstockDataLVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2784.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_instockdatal | LID | pk_instockdatal | char(20) | √ | 主键 (UFID) |
| 2 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 3 | vbarcode | 主条码 | vbarcode | varchar(128) |  | 字符串 (String) |
| 4 | vboxbarcode | 箱条码 | vboxbarcode | varchar(50) |  | 字符串 (String) |
| 5 | vbarcodesub | 次条码 | vbarcodesub | varchar(50) |  | 字符串 (String) |
| 6 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 7 | nnum | 入库主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nassistnum | 入库数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nshouldnum | 应收主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nshouldassistnum | 应收数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | srclid | 来源货位ID | srclid | varchar(50) |  | 字符串 (String) |