# |<<

**成本卷积关系 (sca_costconvrel / nc.vo.sca.costconvrel.entity.CostConvRelHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5047.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costconvrel | 成本卷积关系ID | pk_costconvrel | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ccostregionid_source | 来源成本域 | ccostregionid_source | varchar(20) |  | 组织_成本域 (costregion) |
| 4 | ccostregionid_aim | 目的成本域 | ccostregionid_aim | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | stockorg_source | 来源业务单元 | stockorg_source | varchar(20) |  | 组织 (org) |
| 6 | stockorg_source_v | 来源业务单元版本 | stockorg_source_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | stockorg_aim | 目的业务单元 | stockorg_aim | varchar(20) |  | 组织 (org) |
| 8 | stockorg_aim_v | 目的业务单元版本 | stockorg_aim_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | pk_accbook_source | 来源核算账簿 | pk_accbook_source | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 10 | pk_accbook_aim | 目的核算账簿 | pk_accbook_aim | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 11 | pk_setofbook_source | 来源账簿类型 | pk_setofbook_source | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 12 | pk_setofbook_aim | 目标账簿类型 | pk_setofbook_aim | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 13 | cprofitcenterid_source | 来源利润中心 | cprofitcenterid_source | varchar(20) |  | 利润中心 (profitcenter) |
| 14 | cprofitcenterid_source_v | 来源利润中心版本 | cprofitcenterid_source_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 15 | cprofitcenterid_aim | 目标利润中心 | cprofitcenterid_aim | varchar(20) |  | 利润中心 (profitcenter) |
| 16 | cprofitcenterid_aim_v | 目标利润中心版本 | cprofitcenterid_aim_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 17 | costtransmeth | 成本转移方式 | costtransmeth | int |  | 转移方式 (costConvMethEnum) |  | 1=合并转移; |