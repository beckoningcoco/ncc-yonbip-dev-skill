# |<<

**仓库物料存量 (ic_numctl / nc.vo.ic.ic002.NumctlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2933.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 2 | nmaxstocknum | 最高库存 | nmaxstocknum | decimal(20, 8) |  | 数值 (UFDouble) |
| 3 | nminstocknum | 最低库存 | nminstocknum | decimal(20, 8) |  | 数值 (UFDouble) |
| 4 | nsafestocknum | 安全库存 | nsafestocknum | decimal(20, 8) |  | 数值 (UFDouble) |
| 5 | norderpointnum | 订货点 | norderpointnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 6 | neconomicnum | 经济批量 | neconomicnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 7 | icheckcycle | 盘点周期 | icheckcycle | int |  | 整数 (Integer) |
| 8 | ndullstandard | 呆滞积压标准 | ndullstandard | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | fmrpneed | 是否参与mrp计算 | fmrpneed | char(1) |  | 字符串 (String) |
| 10 | lastcheckts | 最近盘点时间 | lastcheckts | char(19) |  | 字符串 (String) |
| 11 | pk_calbody | 库存组织 | pk_calbody | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | pk_corp | 公司 | pk_corp | varchar(20) |  | 组织_业务单元_公司 (corp) |