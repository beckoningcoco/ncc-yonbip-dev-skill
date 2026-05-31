# |<<

**辅计量管理 (bd_materialconvert_2 / nc.vo.drugbd.dataio.MaterialConvertVO2)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/894.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialconvert | 换算定义主键 | pk_materialconvert | char(20) | √ | 主键 (UFID) |
| 2 | pk_measdoc | 计量单位名称 | pk_measdoc | char(20) | √ | 计量单位 (measdoc) |
| 3 | measrate | 主单位/辅单位 | measrate | varchar(50) | √ | 字符串 (String) |
| 4 | fixedflag | 固定换算 | fixedflag | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 5 | isstorebalance | 结存 | isstorebalance | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 6 | ispumeasdoc | 采购默认单位 | ispumeasdoc | char(1) | √ | 布尔类型 (UFBoolean) |
| 7 | isprodmeasdoc | 生产默认单位 | isprodmeasdoc | char(1) | √ | 布尔类型 (UFBoolean) |
| 8 | isstockmeasdoc | 库存默认单位 | isstockmeasdoc | char(1) | √ | 布尔类型 (UFBoolean) |
| 9 | issalemeasdoc | 销售默认单位 | issalemeasdoc | char(1) | √ | 布尔类型 (UFBoolean) |
| 10 | isretailmeasdoc | 零售默认单位 | isretailmeasdoc | char(1) | √ | 布尔类型 (UFBoolean) |
| 11 | ispiecemangage | 件数管理 | ispiecemangage | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 12 | showorder | 辅计量拆解显示顺序号 | showorder | int |  | 整数 (Integer) |
| 13 | pk_apartmeasdoc | 拆解单位名称 | pk_apartmeasdoc | varchar(20) |  | 计量单位 (measdoc) |
| 14 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) | 0 |
| 15 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |