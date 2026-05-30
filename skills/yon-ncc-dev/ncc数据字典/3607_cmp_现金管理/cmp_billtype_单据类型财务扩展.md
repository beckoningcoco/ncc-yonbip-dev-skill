# |<<

**单据类型财务扩展 (cmp_billtype / nc.vo.cmp.djlx.DjLXVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1539.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtype | 单据类型 | pk_billtype | varchar(20) | √ | 主键 (UFID) |
| 2 | djlxoid | 单据类型oid | djlxoid | char(20) | √ | 主键 (UFID) |
| 3 | dwbm | 单位编码 | dwbm | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | sfbz | 收付标志(无用) | sfbz | varchar(2) |  | 字符串 (String) |
| 5 | djdl | 单据大类 | djdl | varchar(2) |  | 字符串 (String) |
| 6 | fcbz | 封存标志 | fcbz | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | scomment | 备注 | scomment | varchar(181) |  | 字符串 (String) |
| 8 | djlxbm | 单据类型编码 | djlxbm | varchar(20) |  | 字符串 (String) |
| 9 | isbankrecive | 是否银行托收 | isbankrecive | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | isqr | 手动签字 | isqr | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | iscasign | 是否数字签名 | iscasign | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | iscorresp | 是否联动 | iscorresp | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | iscommit | 签字确认传平台 | iscommit | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | djlxjc_remark | 预留字段1 | djlxjc_remark | varchar(50) |  | 字符串 (String) |
| 15 | djlxmc_remark | 预留字段2 | djlxmc_remark | varchar(50) |  | 字符串 (String) |
| 16 | usesystem | 使用系统 | usesystem | varchar(2) |  | 字符串 (String) |
| 17 | isloan | 是否借款报销 | isloan | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | ischangedeptpsn | 是否自动带出部门人员 | ischangedeptpsn | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | ispreparenetbank | 保存时是否自动弹出网银信息 | ispreparenetbank | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | isidvalidated | 是否CA身份认证 | isidvalidated | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | adjustrule | 调整规则 | adjustrule | char(25) |  | 主键 (UFID) |
| 22 | verifyrule | 核销方案 | verifyrule | char(25) |  | 主键 (UFID) |
| 23 | isdefault | 是否默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | issettleshow | 是否显示结算信息 | issettleshow | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | isautocombinsettle | 是否合并结算信息 | isautocombinsettle | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 27 | pk_currtype | 默认币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 28 | isjr | 手动结算 | isjr | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 29 | isfromweb | 共享中心付款 | isfromweb | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | isself | 是否自制单据 | isself | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 32 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 33 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 34 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |