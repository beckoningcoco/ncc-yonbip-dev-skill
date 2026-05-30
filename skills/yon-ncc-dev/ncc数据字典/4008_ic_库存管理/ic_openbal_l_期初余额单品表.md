# |<<

**期初余额单品表 (ic_openbal_l / nc.vo.ic.m40.entity.InitializtionInLocationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2944.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgenerallid | 期初余额单品表主键 | cgenerallid | char(20) | √ | 主键 (UFID) |
| 2 | cgeneralhid | 期初余额表头主键 | cgeneralhid | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | corpvid | 公司 | corpvid | varchar(20) |  | 主键 (UFID) |
| 6 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 7 | vbarcode | 主条码 | vbarcode | varchar(128) |  | 字符串 (String) |
| 8 | vboxbarcode | 箱条码 | vboxbarcode | varchar(50) |  | 字符串 (String) |
| 9 | vbarcodesub | 次条码 | vbarcodesub | varchar(50) |  | 字符串 (String) |
| 10 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 11 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ngrossnum | 毛重数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nshouldnum | 应收主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nshouldassistnum | 应收数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |