# |<<

**利润中心平衡科目设置 (fipub_liabDefAcc / nc.vo.fipub.liabdefacc.LiabDefAccVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2268.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_liabdefacc | 利润中心平衡科目设置主属性 | pk_liabdefacc | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_accasoa | 平衡科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_accountingbook | 财务核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | creationtime | 创建时间 | creationtime | varchar(19) |  | 日期时间 (UFDateTime) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 8 | modifiedtime | 修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |