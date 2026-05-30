# |<<

**医保计划服务分类 (bd_uh_hp_srvcate / com.yonyou.yh.nhis.bd.healthplan.vo.HPSrvCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1040.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpsrvcate | 医保计划服务分类目录主键 | pk_hpsrvcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 5 | pk_srvcate | 服务分类 | pk_srvcate | varchar(50) |  | 字符串 (String) |
| 6 | cate_hp | 医保分类编码 | cate_hp | varchar(50) |  | 字符串 (String) |
| 7 | pk_hptype | 支付类型 | pk_hptype | varchar(20) |  | 医保目录类型(自定义档案) (Defdoc-040001) |
| 8 | dt_hptype | 支付类型编码 | dt_hptype | varchar(50) |  | 字符串 (String) |
| 9 | ratio | 金额自付比例 | ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | date_begin | 开始日期 | date_begin | char(19) |  | 日期(开始) (UFDateBegin) |
| 11 | date_end | 结束日期 | date_end | char(19) |  | 日期(结束) (UFDateEnd) |
| 12 | note | 描述 | note | varchar(200) |  | 备注 (Memo) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 最后修改时间 | modifiedtime | varchar(50) |  | 字符串 (String) |
| 16 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |