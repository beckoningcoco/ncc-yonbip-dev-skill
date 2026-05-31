# |<<

**报销单据类型 (er_djlx / nc.vo.er.djlx.DjLXVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1887.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | djlxoid | 单据类型 | djlxoid | char(20) | √ | 主键 (UFID) |
| 2 | djdl | 单据大类 | djdl | varchar(2) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | djlxbm | 单据类型编码 | djlxbm | varchar(20) |  | 字符串 (String) |
| 5 | fcbz | 封存标志 | fcbz | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | isqr | 手工签字 | isqr | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | iscasign | 是否数字签名 | iscasign | char(1) |  | 布尔类型 (UFBoolean) | N |
| 8 | iscorresp | 是否联动 | iscorresp | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | iscommit | 签字确认传平台 | iscommit | char(1) |  | 布尔类型 (UFBoolean) | N |
| 10 | djlxjc_remark | 预留字段1 | djlxjc_remark | varchar(50) |  | 字符串 (String) |
| 11 | djlxmc_remark | 预留字段2 | djlxmc_remark | varchar(50) |  | 字符串 (String) |
| 12 | isloan | 是否借款报销 | isloan | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | ischangedeptpsn | 是否自动带出部门人员 | ischangedeptpsn | char(1) |  | 布尔类型 (UFBoolean) | N |
| 14 | ispreparenetbank | 是否自动弹出网银信息 | ispreparenetbank | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | isidvalidated | 是否CA身份认证 | isidvalidated | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | issettleshow | 是否显示结算信息 | issettleshow | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | isautocombinse | 是否合并结算信息 | isautocombinse | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | defcurrency | 默认币种 | defcurrency | varchar(20) |  | 币种 (currtype) |
| 19 | creatcashflows | 现金流 | creatcashflows | char(1) |  | 字符串 (String) |
| 20 | djlxjc | 单据类型简称 | djlxjc | varchar(50) |  | 字符串 (String) |
| 21 | djlxmc | 单据类型名称 | djlxmc | varchar(50) |  | 字符串 (String) |
| 22 | djmboid | 名称 | djmboid | varchar(20) |  | 字符串 (String) |
| 23 | dwbm | 业务单元 | dwbm | varchar(20) |  | 字符串 (String) |
| 24 | isbankrecive | 银行收款 | isbankrecive | char(1) |  | 字符串 (String) |
| 25 | iscontrast | 是否冲借款 | iscontrast | char(1) |  | 字符串 (String) | Y |
| 26 | isjszxzf | 是否结算支付 | isjszxzf | int |  | 整数 (Integer) |
| 27 | isloadtemplate | 是否加载模板 | isloadtemplate | char(1) |  | 字符串 (String) | Y |
| 28 | issxbeforewszz | 之前 | issxbeforewszz | char(1) |  | 字符串 (String) |
| 29 | limitcheck | 是否限额支票 | limitcheck | char(1) |  | 字符串 (String) |
| 30 | mjbz | 标志 | mjbz | char(1) |  | 字符串 (String) |
| 31 | pk_org | 财务组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 32 | reimbursement | 是否还款单 | reimbursement | char(1) |  | 字符串 (String) |
| 33 | sfbz | 收付标志 | sfbz | varchar(2) |  | 字符串 (String) | 3 |
| 34 | usesystem | 用户系统 | usesystem | varchar(2) |  | 字符串 (String) |
| 35 | matype | 费用申请类型 | matype | int |  | 费用申请类型 (matype) | 1 | 1=报销费用; |