# |<<

**岗位设置 (pd_ppresp / nc.vo.pd.basedoc.ppresp.entity.PPRespHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4366.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ppresp | 岗位设置 | pk_ppresp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_计划中心 (plancenter) |
| 4 | pk_org_v | 计划中心 | pk_org_v | varchar(20) |  | 组织_业务单元_计划中心版本信息 (plancenter_v) |
| 5 | code | 岗位编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 岗位名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | cemployeeid | 计划员编码 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |