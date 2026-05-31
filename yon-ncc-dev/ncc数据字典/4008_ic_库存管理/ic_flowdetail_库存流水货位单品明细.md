# |<<

**库存流水货位单品明细 (ic_flowdetail / nc.vo.ic.flowaccount.entity.FlowAccountDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2905.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_flowdetail | 主键 | pk_flowdetail | char(20) | √ | 主键 (UFID) |
| 2 | cgeneralbid | 出入库单表体主键 | cgeneralbid | varchar(20) | √ | 主键 (UFID) |
| 3 | cgeneralhid | 出入库单表头主键 | cgeneralhid | varchar(20) | √ | 主键 (UFID) |
| 4 | cgenerallid | 单品明细主键 | cgenerallid | varchar(20) | √ | 主键 (UFID) |
| 5 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 6 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 7 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 8 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 9 | vbarcode | 条形码 | vbarcode | varchar(128) |  | 字符串 (String) |
| 10 | vbarcodesub | 次条码 | vbarcodesub | varchar(100) |  | 字符串 (String) |
| 11 | vboxbarcode | 箱条码 | vboxbarcode | varchar(100) |  | 字符串 (String) |
| 12 | vsncode | 序列号 | vsncode | varchar(128) |  | 字符串 (String) |
| 13 | ninnum | 实收主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ninassistnum | 实收数量 | ninassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ningrossnum | 实收毛重数量 | ningrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | noutnum | 实发主数量 | noutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | noutassistnum | 实发数量 | noutassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | noutgrossnum | 实发毛重数量 | noutgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nretnum | 还回数量 | nretnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nretastnum | 还回辅数量 | nretastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nretgrossnum | 还回毛重 | nretgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |