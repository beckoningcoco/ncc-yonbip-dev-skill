# |<<

**离退待遇 (hi_psndoc_retire / nc.vo.hi.psndoc.RetireVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2581.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | begindate | 离退待遇起始日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | enddate | 离退待遇终止日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | pension | 离退休金 | pension | decimal(20, 2) |  | 数值 (UFDouble) |
| 5 | allowance | 生活补贴 | allowance | decimal(20, 2) |  | 数值 (UFDouble) |
| 6 | otherfee | 其它费用 | otherfee | decimal(20, 2) |  | 数值 (UFDouble) |
| 7 | memo | 说明 | memo | varchar(1000) |  | 字符串 (String) |
| 8 | approveflag | 审批标志 | approveflag | int |  | 整数 (Integer) |
| 9 | pk_corp | 离退休公司 | pk_corp | char(20) |  | 主键 (UFID) |
| 10 | period | 期间 | period | varchar(10) |  | 字符串 (String) |
| 11 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 12 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_psndoc | 人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 14 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 15 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 16 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 17 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 20 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |