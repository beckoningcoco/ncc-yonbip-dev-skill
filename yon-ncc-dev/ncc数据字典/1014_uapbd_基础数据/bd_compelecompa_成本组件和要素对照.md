# |<<

**成本组件和要素对照 (bd_compelecompa / nc.vo.bd.compelecompa.entity.CompEleCompaHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/405.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_compelecompa | 成本组件和要素对照 | pk_compelecompa | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_elementsystem | 核算要素体系 | pk_elementsystem | varchar(20) |  | 责任会计_要素体系 (elementsystem) |
| 5 | pk_factorchart | 核算要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 6 | ccostcompstrucid | 成本组件结构 | ccostcompstrucid | varchar(20) |  | 成本组件结构 (bd_costcompstruc) |
| 7 | pk_book | 核算账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 8 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |