# |<<

**结算附加消息 (jxhp_sett_output_add / nc.vo.nhhp.hp.jx.city.vo.JxHpSettOutputAddVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3539.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sett_output_add | 附加消息主键 | pk_sett_output_add | char(20) | √ | 主键 (UFID) |
| 2 | output_add_1 | 社保三大目录编码 | output_add_1 | varchar(20) |  | 字符串 (String) |
| 3 | output_add_2 | 社保三大目录名称 | output_add_2 | varchar(150) |  | 字符串 (String) |
| 4 | output_add_3 | 收费项目登记 | output_add_3 | varchar(20) |  | 字符串 (String) |
| 5 | output_add_4 | 发票项目类别 | output_add_4 | varchar(20) |  | 字符串 (String) |
| 6 | output_add_5 | 单价 | output_add_5 | decimal(10, 4) |  | 数值 (UFDouble) |
| 7 | output_add_6 | 数量 | output_add_6 | decimal(8, 2) |  | 数值 (UFDouble) |
| 8 | output_add_7 | 金额 | output_add_7 | decimal(10, 4) |  | 数值 (UFDouble) |
| 9 | output_add_8 | 自付金额 | output_add_8 | decimal(10, 4) |  | 数值 (UFDouble) |
| 10 | output_add_9 | 限价标准 | output_add_9 | decimal(10, 4) |  | 数值 (UFDouble) |
| 11 | output_add_10 | 超限价自费金额 | output_add_10 | decimal(10, 4) |  | 数值 (UFDouble) |
| 12 | output_add_11 | 限制使用标志 | output_add_11 | varchar(3) |  | 字符串 (String) |