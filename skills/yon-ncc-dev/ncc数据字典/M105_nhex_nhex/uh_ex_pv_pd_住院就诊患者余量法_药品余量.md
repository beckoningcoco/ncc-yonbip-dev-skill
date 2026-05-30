# |<<

**住院就诊患者余量法_药品余量 (uh_ex_pv_pd / com.yonyou.yh.nhis.ex.pvpd.vo.UhExPvPdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6111.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expvpd | 药品余量主键 | pk_expvpd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊主键 | pk_pv | varchar(50) |  | 字符串 (String) |
| 5 | pk_pd | 物料主键 | pk_pd | varchar(50) |  | 字符串 (String) |
| 6 | name_pd | 物料名称 | name_pd | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | pk_measdoc_base | 基本包装单位 | pk_measdoc_base | varchar(20) |  | 计量单位 (measdoc) |
| 8 | quan_base | 数量 | quan_base | decimal(14, 2) |  | 数值 (UFDouble) |
| 9 | quan_lock | 药品余量锁定数量 | quan_lock | decimal(14, 2) |  | 数值 (UFDouble) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |