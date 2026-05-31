# |<<

**常用凭证表头 (iufo_comvouch_head / nc.vo.hbbb.commonvouch.CommonVouchHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3408.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_comvouch_head | 常用凭证主键 | pk_comvouch_head | char(20) | √ | 主键 (UFID) |
| 2 | vouchorder | 凭证编号 | vouchorder | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | input_date | 制单日期 | input_date | char(19) |  | 日期 (UFDate) |
| 5 | pk_user | 制单人 | pk_user | varchar(20) |  | 用户 (user) |
| 6 | parent_id | 所属分类 | parent_id | varchar(20) |  | 常用凭证的分类 (comvouchsort) |
| 7 | debitname | 借方合并报表项目 | debitname | varchar(50) |  | 字符串 (String) |
| 8 | creditname | 贷方合并报表项目 | creditname | varchar(50) |  | 字符串 (String) |
| 9 | digest | 摘要 | digest | varchar(50) |  | 字符串 (String) |
| 10 | pk_dxtype | 抵销分录类别 | pk_dxtype | varchar(20) |  | 抵销分录类别 (DXTypeVO) |
| 11 | vouchtype | 凭证类别 | vouchtype | varchar(50) |  | 常用凭证类别 (enum) |  | 1=常用调整凭证; |