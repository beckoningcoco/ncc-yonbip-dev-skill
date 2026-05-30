# |<<

**内部交易规则 (gl_contrastrule / nc.vo.gl.contrast.rule.ContrastRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2380.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastrule | 对账规则设置标识 | pk_contrastrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_book | 账簿类型 | pk_book | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 4 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(100) |  | 字符串 (String) |
| 6 | contrastcontent | 对账内容 | contrastcontent | char(5) |  | 字符串 (String) |
| 7 | startdate | 启用日期 | startdate | char(19) |  | 日期 (UFDate) |
| 8 | enddate | 停用日期 | enddate | char(19) |  | 日期 (UFDate) |
| 9 | untallied | 是否包含未记账 | untallied | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | createorg | 创建单位 | createorg | varchar(20) |  | 组织_集团 (group) |
| 12 | contrastmoney | 对账金额性质 | contrastmoney | varchar(50) |  | 对账金额性质 (moneyenum) |  | Y=余额; |