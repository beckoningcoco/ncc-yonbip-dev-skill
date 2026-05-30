# |<<

**入库货位信息 (hstf_instockdatal / nc.vo.hstf.instockdata.InstockDataLVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2771.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_instockdata_l | LID | pk_instockdata_l | char(20) | √ | 主键 (UFID) |
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
| 12 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |