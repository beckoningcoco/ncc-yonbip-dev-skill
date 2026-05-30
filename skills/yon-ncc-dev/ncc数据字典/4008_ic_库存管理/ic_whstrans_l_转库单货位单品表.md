# |<<

**转库单货位单品表 (ic_whstrans_l / nc.vo.ic.m4k.entity.WhsTransBillLocationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3019.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cspeciallid | 转库单货位单品表主键 | cspeciallid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 主键 (UFID) |
| 5 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 6 | vbarcode | 主条码 | vbarcode | varchar(50) |  | 字符串 (String) |
| 7 | vboxbarcode | 箱条码 | vboxbarcode | varchar(50) |  | 字符串 (String) |
| 8 | vbarcodesub | 次条码 | vbarcodesub | varchar(50) |  | 字符串 (String) |
| 9 | vserialcode | 序列号 | vserialcode | varchar(50) |  | 字符串 (String) |
| 10 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ngrossnum | 毛重数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | cspecialhid | 转库单主键 | cspecialhid | char(20) |  | 主键 (UFID) |