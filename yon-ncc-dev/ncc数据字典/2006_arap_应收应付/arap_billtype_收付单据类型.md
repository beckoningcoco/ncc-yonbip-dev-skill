# |<<

**收付单据类型 (arap_billtype / nc.vo.arap.djlx.DjLXVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/168.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtype | 单据类型 | pk_billtype | char(20) | √ | 主键 (UFID) |
| 2 | djdl | 单据大类 | djdl | varchar(2) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | djlxbm | 单据类型编码 | djlxbm | varchar(20) | √ | 字符串 (String) |
| 5 | fcbz | 封存标志 | fcbz | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isqr | 是否签字确认 | isqr | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | iscasign | 是否数字签名 | iscasign | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | iscommit | 是否自动结算 | iscommit | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | djlxjc_remark | 预留字段1 | djlxjc_remark | varchar(50) |  | 字符串 (String) |
| 10 | djlxmc_remark | 预留字段2 | djlxmc_remark | varchar(50) |  | 字符串 (String) |
| 11 | ischangedeptpsn | 是否自动带出部门人员 | ischangedeptpsn | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | ispreparenetbank | 是否自动弹出网银信息 | ispreparenetbank | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | isidvalidated | 是否CA身份认证 | isidvalidated | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_currtype | 默认币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 15 | iscombine | 是否合并结算信息 | iscombine | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | isrowmergevat | 是否行合并计税税额 | isrowmergevat | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | scomment | 备注 | scomment | varchar(101) |  | 自定义项 (Custom) |
| 18 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 20 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |