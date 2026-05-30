# |<<

**库存借入还回单品 (ic_returnout_l / nc.vo.ic.m4j.entity.ReturnOutLocationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2970.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgenerallid | 货位单品表主键 | cgenerallid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 6 | vbarcode | 主条码 | vbarcode | varchar(50) |  | 字符串 (String) |
| 7 | vboxbarcode | 箱条码 | vboxbarcode | varchar(50) |  | 字符串 (String) |
| 8 | vbarcodesub | 次条码 | vbarcodesub | varchar(50) |  | 字符串 (String) |
| 9 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 10 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ngrossnum | 毛重数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nshouldnum | 应发主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nshouldassistnum | 应发数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | cgeneralhid | 入库单表头主键 | cgeneralhid | char(20) |  | 主键 (UFID) |
| 16 | cgeneralbid | 库存借入还出表体主键 | cgeneralbid | char(20) |  | 主键 (UFID) |
| 17 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |