# |<<

**医保计划服务 (bd_uh_hp_srv / com.yonyou.yh.nhis.bd.healthplan.vo.HPUHSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpsrv | 医保计划服务主键 | pk_hpsrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 5 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 6 | code_hp | 医保服务项目编码 | code_hp | varchar(50) |  | 字符串 (String) |
| 7 | cate_hp | 医保分类编码 | cate_hp | varchar(50) |  | 字符串 (String) |
| 8 | pk_hptype | 支付类型 | pk_hptype | varchar(20) |  | 医保目录类型(自定义档案) (Defdoc-040001) |
| 9 | dt_hptype | 支付类型编码 | dt_hptype | varchar(50) |  | 字符串 (String) |
| 10 | radio | 金额自付比例 | radio | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | price | 单价上限 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | date_begin | 开始日期 | date_begin | char(19) |  | 日期(开始) (UFDateBegin) |
| 13 | date_end | 结束日期 | date_end | char(19) |  | 日期(结束) (UFDateEnd) |
| 14 | note | 描述 | note | varchar(200) |  | 备注 (Memo) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |