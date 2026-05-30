# |<<

**固定资产盘点单 (fa_inventory / nc.vo.fa.inventory.InventoryHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2030.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inventory | 盘点单主表主键 | pk_inventory | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_raorg | 利润中心最新版本 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_raorg_v | 利润中心 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | bill_code | 单据编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 8 | check_range | 盘点范围 | check_range | varchar(256) |  | 字符串 (String) |
| 9 | start_date | 盘点开始日期 | start_date | char(20) |  | 日期 (UFDate) |
| 10 | end_date | 盘点结束日期 | end_date | char(20) |  | 日期 (UFDate) |
| 11 | check_standard | 盘点依据 | check_standard | int |  | 盘点依据 (check_stand) | 1 | 1=资产编码; |