# |<<

**检测室子表 (qc_checkteam_b / nc.vo.qc.checkteam.entity.CheckTeamItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4839.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkteam_b | 检测室子表PK | pk_checkteam_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 检测中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_psndoc | 检验员编码 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |