# |<<

**医保返回明细 (hp_ipcg_ret / com.yonyou.yh.nhis.hp.hp.vo.HpIpcgRetVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2610.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpret | 主键 | pk_hpret | char(28) | √ | 主键 (UFID) |
| 2 | pk_cg | 住院计费 | pk_cg | varchar(36) |  | 住院记费 (uhblcgip) |
| 3 | pk_pv | 就诊主键 | pk_pv | varchar(36) |  | 患者就诊 (PatiVisitVO) |
| 4 | outtreatmoney | 超出治疗方案金额 | outtreatmoney | varchar(20) |  | 字符串 (String) |
| 5 | selfmoney | 自理金额 | selfmoney | varchar(20) |  | 字符串 (String) |
| 6 | privatemoney | 自费金额 | privatemoney | varchar(20) |  | 字符串 (String) |
| 7 | chargelevel | 收费项目等级 | chargelevel | varchar(20) |  | 收费项目等级 (enum) |  | 1=甲类; |