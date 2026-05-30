# |<<

**其它证书 (hi_psndoc_othercert / nc.vo.hi.psndoc.OtherCertVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2576.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 3 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 6 | pk_psnjob | 工作记录主键 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 7 | pk_cert | 证书档案主键 | pk_cert | varchar(20) | √ | 证书档案 (ctffile) |
| 8 | certcode | 证书编号 | certcode | varchar(200) |  | 字符串 (String) |
| 9 | firstdate | 首次颁证日期 | firstdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 10 | lastdate | 续证日期 | lastdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 11 | enddate | 失效日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 12 | certorg | 颁证单位 | certorg | varchar(256) |  | 字符串 (String) |
| 13 | iscancel | 撤销 | iscancel | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | remark | 备注 | remark | varchar(500) |  | 备注 (Memo) |
| 15 | sourcetype | 记录来源 | sourcetype | int |  | 记录来源 (sourcetype) |  | 1=培训活动颁发; |