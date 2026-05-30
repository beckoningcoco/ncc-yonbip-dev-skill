# |<<

**临床主观信息 (uh_cn_subj / com.yonyou.yh.nhis.cn.diag.vo.CNSubjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6055.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnsubj | 患者就诊主观信息主键 | pk_cnsubj | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | desc_prob | 患者主诉描述 | desc_prob | varchar(4000) |  | 字符串 (String) |
| 6 | dies_cur | 患者现病史描述 | dies_cur | varchar(4000) |  | 字符串 (String) |
| 7 | dies_hist | 患者既往史描述 | dies_hist | varchar(4000) |  | 字符串 (String) |
| 8 | pk_cnet | 临床事件 | pk_cnet | varchar(20) |  | 临床_事件 (cnevent) |
| 9 | pk_org_v | 所属机构版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |