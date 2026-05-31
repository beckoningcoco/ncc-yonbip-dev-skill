# |<<

**协同模版凭证设置 (gl_modelsetvoucher / nc.vo.gl.reconcilemodule.modelsetvoucher)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2431.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilesub | 协同模板主表 | pk_reconcilesub | varchar(20) |  | 协同定义明细 (reconcilesub) |
| 2 | isself | 是否本方 | isself | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_vouchertype | 凭证类别主键 | pk_vouchertype | char(20) |  | 主键 (UFID) |
| 4 | pk_sob | 帐簿主键 | pk_sob | char(20) |  | 主键 (UFID) |
| 5 | attachment | 附单据数 | attachment | int |  | 整数 (Integer) |
| 6 | modifyflag | 修改标志 | modifyflag | char(20) |  | 主键 (UFID) |
| 7 | explanation | 摘要 | explanation | varchar(200) |  | 字符串 (String) |
| 8 | freefield1 | 扩展字段1 | freefield1 | char(20) |  | 主键 (UFID) |
| 9 | freefield2 | 扩展字段2 | freefield2 | char(20) |  | 主键 (UFID) |
| 10 | freefield3 | 扩展字段3 | freefield3 | char(20) |  | 主键 (UFID) |
| 11 | freefield4 | 扩展字段4 | freefield4 | char(20) |  | 主键 (UFID) |
| 12 | freefield5 | 扩展字段5 | freefield5 | char(20) |  | 主键 (UFID) |
| 13 | freefield6 | 扩展字段6 | freefield6 | char(20) |  | 主键 (UFID) |
| 14 | freefield7 | 扩展字段7 | freefield7 | char(20) |  | 主键 (UFID) |
| 15 | freefield8 | 扩展字段8 | freefield8 | char(20) |  | 主键 (UFID) |
| 16 | freefield9 | 扩展字段9 | freefield9 | char(20) |  | 主键 (UFID) |
| 17 | freefield10 | 扩展字段10 | freefield10 | char(20) |  | 主键 (UFID) |
| 18 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 19 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 20 | pk_setofbook | 核算账簿 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 21 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |